package me.rosuh.filepicker.config

import android.view.View
import me.rosuh.filepicker.adapter.FileListAdapter

/**
 *
 * @author rosu
 * @date 2018/11/26
 */
@Deprecated("It's not flexible enough.", replaceWith = ReplaceWith("me.rosuh.filepicker.config.ItemClickListener"))
interface FileItemOnClickListener {

    fun onItemClick(
        itemAdapter: FileListAdapter,
        itemView: View,
        position: Int
    )

    fun onItemChildClick(
        itemAdapter: FileListAdapter,
        itemView: View,
        position: Int
    )

    fun onItemLongClick(
        itemAdapter: FileListAdapter,
        itemView: View,
        position: Int
    )
}