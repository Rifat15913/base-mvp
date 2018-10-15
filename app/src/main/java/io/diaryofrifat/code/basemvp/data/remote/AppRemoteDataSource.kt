package io.diaryofrifat.code.basemvp.data.remote

import android.content.Context
import io.diaryofrifat.code.basemvp.data.remote.retrophoto.RetroPhoto
import io.diaryofrifat.code.basemvp.data.remote.retrophoto.RetroPhotoService
import io.reactivex.Observable

class AppRemoteDataSource(context: Context){
    fun getAllPhotos() : Observable<List<RetroPhoto>>{
        return RetroPhotoService.on().getAllPhotos()
    }
}