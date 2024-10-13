package com.native_demo


import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import com.native_demo.brightness.BrightnessModule
import com.native_demo.keyevent.KeyEventModule

class CustomModules: ReactPackage {

    override fun createViewManagers(reactPackage: ReactApplicationContext): List<ViewManager<*, *>> {
      return emptyList()
    }

    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
        val modules: MutableList<NativeModule> = ArrayList()
        KeyEventModule.initModuleInstance(reactContext)?.let {modules.add(it)}
        modules.add(BrightnessModule(reactContext))
        return modules
    }


}