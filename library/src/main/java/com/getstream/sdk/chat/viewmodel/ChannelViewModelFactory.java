package com.getstream.sdk.chat.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ChannelViewModelFactory implements ViewModelProvider.Factory {

    private Application app;
    private final String channelType;
    private final String channelId;
    private String messageId;

    public ChannelViewModelFactory(Application application, String channelType, String channelId, String messageId) {
        this.app = application;
        this.channelType = channelType;
        this.channelId = channelId;
        this.messageId = messageId;
    }

    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new ChannelViewModel(app, channelType, channelId, messageId);
    }
}