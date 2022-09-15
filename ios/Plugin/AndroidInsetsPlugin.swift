import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(AndroidInsetsPlugin)
public class AndroidInsetsPlugin: CAPPlugin {
    private let implementation = AndroidInsets()

    @objc func top(_ call: CAPPluginCall) {
        call.resolve([
            "value": implementation.top()
        ])
    }
}
