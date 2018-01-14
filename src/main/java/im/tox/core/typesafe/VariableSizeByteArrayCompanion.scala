package im.tox.core.typesafe

abstract class VariableSizeByteArrayCompanion[T <: AnyVal](
    val MaxSize: Int,
    toValue: T => Array[Byte]
) extends ByteArrayCompanion[T, Security.Sensitive](toValue) {

  override protected def validate: Validator = super.validate { value =>
    Validator.require(value.length <= MaxSize, s"Invalid length: ${value.length} > $MaxSize")
  }

}
