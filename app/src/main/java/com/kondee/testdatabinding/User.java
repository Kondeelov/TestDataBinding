package com.kondee.testdatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

public class User extends BaseObservable {

    public ObservableField<String> field = new ObservableField<>();
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public User setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
        notifyPropertyChanged(BR.fullName);
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    @Bindable
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public User setLastName(String latName) {
        this.lastName = latName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }
}
