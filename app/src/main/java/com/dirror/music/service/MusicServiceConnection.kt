package com.dirror.music.service

import android.content.ComponentName
import android.content.ServiceConnection
import android.os.IBinder
import com.dirror.music.MyApplication

/**
 * 音乐服务连接
 */
class MusicServiceConnection : ServiceConnection {

    /**
     * 服务连接后
     */
    override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
        MyApplication.musicBinderInterface = p1 as MusicBinderInterface
    }

    /**
     * 服务意外断开连接
     */
    override fun onServiceDisconnected(p0: ComponentName?) {
        // MyApplication.musicBinderInterface = null
    }

}