package com.example.android.gitthub_user;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Users implements Parcelable {
    @SerializedName("login")
    private String login;
    @SerializedName("avatar_url")
    private String avatar_url;
    @SerializedName("html_url")
    private String html_url;
    @SerializedName("public_gists")
    private String public_gists;
    @SerializedName("name")
    private String name;
    @SerializedName("location")
    private String location;
    @SerializedName("company")
    private String company;
    @SerializedName("followers")
    private String totalFollowers;
    @SerializedName("following")
    private String totalFollowings;
    @SerializedName("public_gists")
    private String repository;
    @SerializedName("blog")
    private String blog;

    public Users(String login, String avatar_url, String html_url, String public_gists, String name, String location, String company, String totalFollowers, String totalFollowings, String repository, String blog) {
        this.login = login;
        this.avatar_url = avatar_url;
        this.html_url = html_url;
        this.public_gists = public_gists;
        this.name = name;
        this.location = location;
        this.company = company;
        this.totalFollowers = totalFollowers;
        this.totalFollowings = totalFollowings;
        this.repository = repository;
        this.blog = blog;
    }

    protected Users(Parcel in) {
        login = in.readString();
        avatar_url = in.readString();
        html_url = in.readString();
        public_gists = in.readString();
        name = in.readString();
        location = in.readString();
        company = in.readString();
        totalFollowers = in.readString();
        totalFollowings = in.readString();
        repository = in.readString();
        blog = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(login);
        dest.writeString(avatar_url);
        dest.writeString(html_url);
        dest.writeString(public_gists);
        dest.writeString(name);
        dest.writeString(location);
        dest.writeString(company);
        dest.writeString(totalFollowers);
        dest.writeString(totalFollowings);
        dest.writeString(repository);
        dest.writeString(blog);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Users> CREATOR = new Creator<Users>() {
        @Override
        public Users createFromParcel(Parcel in) {
            return new Users(in);
        }

        @Override
        public Users[] newArray(int size) {
            return new Users[size];
        }
    };

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getPublic_gists() {
        return public_gists;
    }

    public void setPublic_gists(String public_gists) {
        this.public_gists = public_gists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTotalFollowers() {
        return totalFollowers;
    }

    public void setTotalFollowers(String totalFollowers) {
        this.totalFollowers = totalFollowers;
    }

    public String getTotalFollowings() {
        return totalFollowings;
    }

    public void setTotalFollowings(String totalFollowings) {
        this.totalFollowings = totalFollowings;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }
}
