package im.tox.tox4j.av.callbacks

trait ToxAvEventListener[ToxCoreState]
  extends CallCallback[ToxCoreState]
  with CallStateCallback[ToxCoreState]
  with AudioBitRateCallback[ToxCoreState]
  with VideoBitRateCallback[ToxCoreState]
  with AudioReceiveFrameCallback[ToxCoreState]
  with VideoReceiveFrameCallback[ToxCoreState]
