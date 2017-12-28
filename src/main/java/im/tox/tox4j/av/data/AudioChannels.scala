package im.tox.tox4j.av.data

import im.tox.core.typesafe.DiscreteIntCompanion

final case class AudioChannels private (value: Int) extends AnyVal

case object AudioChannels extends DiscreteIntCompanion[AudioChannels](1, 2) {

  val Mono: AudioChannels = new AudioChannels(1)
  val Stereo: AudioChannels = new AudioChannels(2)

  override def unsafeFromInt(value: Int): AudioChannels = new AudioChannels(value)
  override def toInt(self: AudioChannels): Int = self.value

}
