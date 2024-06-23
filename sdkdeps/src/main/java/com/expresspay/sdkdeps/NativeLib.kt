package com.expresspay.sdkdeps

class NativeLib {

    /**
     * A native method that is implemented by the 'sdkdeps' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'sdkdeps' library on application startup.
        init {
            System.loadLibrary("sdkdeps")
        }
    }
}