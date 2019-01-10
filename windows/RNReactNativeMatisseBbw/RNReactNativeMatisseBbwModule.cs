using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Matisse.Bbw.RNReactNativeMatisseBbw
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeMatisseBbwModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeMatisseBbwModule"/>.
        /// </summary>
        internal RNReactNativeMatisseBbwModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeMatisseBbw";
            }
        }
    }
}
