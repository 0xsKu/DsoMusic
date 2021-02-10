package com.dirror.music.ui.activity

import com.dirror.music.MyApplication
import com.dirror.music.databinding.ActivitySettingsBinding
import com.dirror.music.ui.base.BaseActivity
import com.dirror.music.util.*

/**
 * 设置 Activity
 */
class SettingsActivity : BaseActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun initBinding() {
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun initView() {
        // 按钮
        binding.apply {
            switcherParseHomeNavigation.setChecked(MyApplication.mmkv.decodeBool(Config.PARSE_NAVIGATION, true))
            switcherPlaylistScrollAnimation.setChecked(MyApplication.mmkv.decodeBool(Config.PLAYLIST_SCROLL_ANIMATION, true))
            switcherDarkTheme.setChecked(MyApplication.mmkv.decodeBool(Config.DARK_THEME, false))
            switcherPlayOnMobile.setChecked(MyApplication.mmkv.decodeBool(Config.PLAY_ON_MOBILE, false))
            switcherPauseSongAfterUnplugHeadset.setChecked(MyApplication.mmkv.decodeBool(Config.PAUSE_SONG_AFTER_UNPLUG_HEADSET, true))
            switcherSkipErrorMusic.setChecked(MyApplication.mmkv.decodeBool(Config.SKIP_ERROR_MUSIC, true))
            switcherFilterRecord.setChecked(MyApplication.mmkv.decodeBool(Config.FILTER_RECORD, true))
            switcherLocalMusicParseLyric.setChecked(MyApplication.mmkv.decodeBool(Config.PARSE_INTERNET_LYRIC_LOCAL_MUSIC, true))
            switcherSmartFilter.setChecked(MyApplication.mmkv.decodeBool(Config.SMART_FILTER, true))
        }

    }

    override fun initListener() {
        binding.apply {

            switcherParseHomeNavigation.setOnCheckedChangeListener { MyApplication.mmkv.encode(Config.PARSE_NAVIGATION, it) }

            switcherPlaylistScrollAnimation.setOnCheckedChangeListener { MyApplication.mmkv.encode(Config.PLAYLIST_SCROLL_ANIMATION, it) }

            switcherDarkTheme.setOnCheckedChangeListener {
                DarkThemeUtil.setDarkTheme(it)
                MyApplication.mmkv.encode(Config.DARK_THEME, it)
            }

            switcherFilterRecord.setOnCheckedChangeListener { MyApplication.mmkv.encode(Config.FILTER_RECORD, it) }

            switcherLocalMusicParseLyric.setOnCheckedChangeListener { MyApplication.mmkv.encode(Config.PARSE_INTERNET_LYRIC_LOCAL_MUSIC, it) }

            switcherSkipErrorMusic.setOnCheckedChangeListener { MyApplication.mmkv.encode(Config.SKIP_ERROR_MUSIC, it) }

            switcherPlayOnMobile.setOnCheckedChangeListener { MyApplication.mmkv.encode(Config.PLAY_ON_MOBILE, it) }

            switcherPauseSongAfterUnplugHeadset.setOnCheckedChangeListener { MyApplication.mmkv.encode(Config.PAUSE_SONG_AFTER_UNPLUG_HEADSET, it) }

            switcherSmartFilter.setOnCheckedChangeListener { MyApplication.mmkv.encode(Config.SMART_FILTER, it) }
        }
    }

}