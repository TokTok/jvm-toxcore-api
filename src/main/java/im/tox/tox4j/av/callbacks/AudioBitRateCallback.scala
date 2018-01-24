package im.tox.tox4j.av.callbacks

import im.tox.tox4j.av.data.BitRate
import im.tox.tox4j.core.data.ToxFriendNumber

/**
 * The event is triggered when the network becomes too saturated for current
 * bit rates at which point core suggests new bit rates.
 */
trait AudioBitRateCallback[ToxCoreState] {
  /**
   * @param friendNumber The friend number of the friend for which to set the
   *                     audio bit rate.
   * @param audioBitRate Suggested maximum audio bit rate in Kb/sec.
   */
  def audioBitRate(
    friendNumber: ToxFriendNumber, audioBitRate: BitRate
  )(state: ToxCoreState): ToxCoreState = state
}
