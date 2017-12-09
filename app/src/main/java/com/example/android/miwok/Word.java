package com.example.android.miwok;

/**
 * Created by Nick on 11/18/2017.
 */

public class Word {

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId;
    private int audioResourceId;
    private boolean hasImage;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {

        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceId = audioResourceId;
        this.hasImage = false;

    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {

        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId;
        this.hasImage = true;

    }

    public String getDefaultTranslation() {

        return defaultTranslation;

    }

    public String getMiwokTranslation() {

        return miwokTranslation;

    }

    public int getImageResourceId() {

        return imageResourceId;

    }

    public int getAudioResourceId() {

        return audioResourceId;

    }

    public boolean wordHasImage() {

        return hasImage;

    }

}
