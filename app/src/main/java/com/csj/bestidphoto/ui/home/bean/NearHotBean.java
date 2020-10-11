package com.csj.bestidphoto.ui.home.bean;

import android.os.Parcel;
import android.os.Parcelable;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.ArrayList;
import java.util.List;

public class NearHotBean implements MultiItemEntity,Parcelable {

    public final static int HOME_ITEM_TYPE_CONTENT = 1;
    public final static int HOME_ITEM_TYPE_TITLE = 2;

    private int itemType;
    private String photoModelName;
    private int pxW;
    private int pxH;
    private int mmW;
    private int mmH;
    private List<Integer> colors = new ArrayList<>();
    private String sizeLimit;
    private String otherLimit;
    private int dpi;

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public List<Integer> getColors() {
        return colors;
    }

    public void setColors(List<Integer> colors) {
        this.colors.clear();
        this.colors.addAll(colors);
    }

    public int getMmW() {
        return mmW;
    }

    public void setMmW(int mmW) {
        this.mmW = mmW;
    }

    public int getMmH() {
        return mmH;
    }

    public void setMmH(int mmH) {
        this.mmH = mmH;
    }

    public String getSizeLimit() {
        return sizeLimit;
    }

    public void setSizeLimit(String sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    public String getOtherLimit() {
        return otherLimit;
    }

    public void setOtherLimit(String otherLimit) {
        this.otherLimit = otherLimit;
    }

    public String getPhotoModelName() {
        return photoModelName;
    }

    public void setPhotoModelName(String photoModelName) {
        this.photoModelName = photoModelName;
    }

    public int getPxW() {
        return pxW;
    }

    public void setPxW(int pxW) {
        this.pxW = pxW;
    }

    public int getPxH() {
        return pxH;
    }

    public void setPxH(int pxH) {
        this.pxH = pxH;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public NearHotBean() {
    }

    @Override
    public int getItemType() {
        return itemType;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.itemType);
        dest.writeString(this.photoModelName);
        dest.writeInt(this.pxW);
        dest.writeInt(this.pxH);
    }

    protected NearHotBean(Parcel in) {
        this.itemType = in.readInt();
        this.photoModelName = in.readString();
        this.pxW = in.readInt();
        this.pxH = in.readInt();
    }

    public static final Creator<NearHotBean> CREATOR = new Creator<NearHotBean>() {
        @Override
        public NearHotBean createFromParcel(Parcel source) {
            return new NearHotBean(source);
        }

        @Override
        public NearHotBean[] newArray(int size) {
            return new NearHotBean[size];
        }
    };
}
