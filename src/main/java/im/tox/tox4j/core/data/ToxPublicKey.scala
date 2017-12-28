package im.tox.tox4j.core.data

import im.tox.core.typesafe.{ KeyCompanion, Security }
import im.tox.tox4j.crypto.ToxCryptoConstants

@SuppressWarnings(Array("org.wartremover.warts.ArrayEquals"))
final case class ToxPublicKey private (value: Array[Byte]) extends AnyVal {
  def toHexString: String = ToxPublicKey.toHexString(this)
  override def toString: String = s"$productPrefix($toHexString)"
}

case object ToxPublicKey extends KeyCompanion[ToxPublicKey, Security.NonSensitive](
  ToxCryptoConstants.PublicKeyLength,
  _.value
) {

  override def unsafeFromValue(value: Array[Byte]): ToxPublicKey = new ToxPublicKey(value)

}
