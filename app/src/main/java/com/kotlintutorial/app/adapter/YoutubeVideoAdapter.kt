package com.kotlintutorial.app.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kotlintutorial.app.databinding.LayoutYoutubeItemBinding
import com.kotlintutorial.app.model.Lesson
import com.kotlintutorial.model.VideoLesson
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener

class YoutubeVideoAdapter(val context: Lifecycle) :
    ListAdapter<VideoLesson, YoutubeVideoAdapter.MyViewHolder>(diffCallBack) {

    class MyViewHolder(val binding: LayoutYoutubeItemBinding) :
        RecyclerView.ViewHolder(binding.root)


    companion object {
        val diffCallBack = object : DiffUtil.ItemCallback<VideoLesson>() {
            override fun areItemsTheSame(oldItem: VideoLesson, newItem: VideoLesson): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: VideoLesson, newItem: VideoLesson): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutYoutubeItemBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = getItem(position)
        holder.binding.title.text=item.title
        context.addObserver(holder.binding.youtubeVideo)
        holder.binding.youtubeVideo.addYouTubePlayerListener(object : YouTubePlayerListener {
            override fun onApiChange(youTubePlayer: YouTubePlayer) {
            }

            override fun onCurrentSecond(youTubePlayer: YouTubePlayer, second: Float) {
            }

            override fun onError(youTubePlayer: YouTubePlayer, error: PlayerConstants.PlayerError) {
            }

            override fun onPlaybackQualityChange(
                youTubePlayer: YouTubePlayer,
                playbackQuality: PlayerConstants.PlaybackQuality,
            ) {
            }

            override fun onPlaybackRateChange(
                youTubePlayer: YouTubePlayer,
                playbackRate: PlayerConstants.PlaybackRate,
            ) {
            }

            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(item.videoId, 0F)
                holder.binding.progressbar.visibility = View.GONE
            }

            override fun onStateChange(
                youTubePlayer: YouTubePlayer,
                state: PlayerConstants.PlayerState,
            ) {
            }

            override fun onVideoDuration(youTubePlayer: YouTubePlayer, duration: Float) {
            }

            override fun onVideoId(youTubePlayer: YouTubePlayer, videoId: String) {
            }

            override fun onVideoLoadedFraction(
                youTubePlayer: YouTubePlayer,
                loadedFraction: Float,
            ) {
            }
        })
    }
}