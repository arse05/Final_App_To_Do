// Generated by view binder compiler. Do not edit!
package com.coding.meet.todo_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.coding.meet.todo_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class WeatherBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView address;

  @NonNull
  public final LinearLayout addressContainer;

  @NonNull
  public final ImageView closeWeather;

  @NonNull
  public final TextView descrTxt;

  @NonNull
  public final LinearLayout detailsContainer;

  @NonNull
  public final TextView errorText;

  @NonNull
  public final TextView feelLike;

  @NonNull
  public final TextView humidity;

  @NonNull
  public final ProgressBar loader;

  @NonNull
  public final RelativeLayout mainContainer;

  @NonNull
  public final LinearLayout overviewContainer;

  @NonNull
  public final TextView pressure;

  @NonNull
  public final TextView sunrise;

  @NonNull
  public final TextView sunset;

  @NonNull
  public final TextView temp;

  @NonNull
  public final TextView tempMax;

  @NonNull
  public final TextView tempMin;

  @NonNull
  public final TextView updatedAt;

  @NonNull
  public final Button weatherButton;

  @NonNull
  public final TextView wind;

  private WeatherBinding(@NonNull RelativeLayout rootView, @NonNull TextView address,
      @NonNull LinearLayout addressContainer, @NonNull ImageView closeWeather,
      @NonNull TextView descrTxt, @NonNull LinearLayout detailsContainer,
      @NonNull TextView errorText, @NonNull TextView feelLike, @NonNull TextView humidity,
      @NonNull ProgressBar loader, @NonNull RelativeLayout mainContainer,
      @NonNull LinearLayout overviewContainer, @NonNull TextView pressure,
      @NonNull TextView sunrise, @NonNull TextView sunset, @NonNull TextView temp,
      @NonNull TextView tempMax, @NonNull TextView tempMin, @NonNull TextView updatedAt,
      @NonNull Button weatherButton, @NonNull TextView wind) {
    this.rootView = rootView;
    this.address = address;
    this.addressContainer = addressContainer;
    this.closeWeather = closeWeather;
    this.descrTxt = descrTxt;
    this.detailsContainer = detailsContainer;
    this.errorText = errorText;
    this.feelLike = feelLike;
    this.humidity = humidity;
    this.loader = loader;
    this.mainContainer = mainContainer;
    this.overviewContainer = overviewContainer;
    this.pressure = pressure;
    this.sunrise = sunrise;
    this.sunset = sunset;
    this.temp = temp;
    this.tempMax = tempMax;
    this.tempMin = tempMin;
    this.updatedAt = updatedAt;
    this.weatherButton = weatherButton;
    this.wind = wind;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WeatherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WeatherBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.weather, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WeatherBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address;
      TextView address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.addressContainer;
      LinearLayout addressContainer = ViewBindings.findChildViewById(rootView, id);
      if (addressContainer == null) {
        break missingId;
      }

      id = R.id.close_weather;
      ImageView closeWeather = ViewBindings.findChildViewById(rootView, id);
      if (closeWeather == null) {
        break missingId;
      }

      id = R.id.descrTxt;
      TextView descrTxt = ViewBindings.findChildViewById(rootView, id);
      if (descrTxt == null) {
        break missingId;
      }

      id = R.id.detailsContainer;
      LinearLayout detailsContainer = ViewBindings.findChildViewById(rootView, id);
      if (detailsContainer == null) {
        break missingId;
      }

      id = R.id.errorText;
      TextView errorText = ViewBindings.findChildViewById(rootView, id);
      if (errorText == null) {
        break missingId;
      }

      id = R.id.feel_like;
      TextView feelLike = ViewBindings.findChildViewById(rootView, id);
      if (feelLike == null) {
        break missingId;
      }

      id = R.id.humidity;
      TextView humidity = ViewBindings.findChildViewById(rootView, id);
      if (humidity == null) {
        break missingId;
      }

      id = R.id.loader;
      ProgressBar loader = ViewBindings.findChildViewById(rootView, id);
      if (loader == null) {
        break missingId;
      }

      id = R.id.mainContainer;
      RelativeLayout mainContainer = ViewBindings.findChildViewById(rootView, id);
      if (mainContainer == null) {
        break missingId;
      }

      id = R.id.overviewContainer;
      LinearLayout overviewContainer = ViewBindings.findChildViewById(rootView, id);
      if (overviewContainer == null) {
        break missingId;
      }

      id = R.id.pressure;
      TextView pressure = ViewBindings.findChildViewById(rootView, id);
      if (pressure == null) {
        break missingId;
      }

      id = R.id.sunrise;
      TextView sunrise = ViewBindings.findChildViewById(rootView, id);
      if (sunrise == null) {
        break missingId;
      }

      id = R.id.sunset;
      TextView sunset = ViewBindings.findChildViewById(rootView, id);
      if (sunset == null) {
        break missingId;
      }

      id = R.id.temp;
      TextView temp = ViewBindings.findChildViewById(rootView, id);
      if (temp == null) {
        break missingId;
      }

      id = R.id.temp_max;
      TextView tempMax = ViewBindings.findChildViewById(rootView, id);
      if (tempMax == null) {
        break missingId;
      }

      id = R.id.temp_min;
      TextView tempMin = ViewBindings.findChildViewById(rootView, id);
      if (tempMin == null) {
        break missingId;
      }

      id = R.id.updated_at;
      TextView updatedAt = ViewBindings.findChildViewById(rootView, id);
      if (updatedAt == null) {
        break missingId;
      }

      id = R.id.weather_button;
      Button weatherButton = ViewBindings.findChildViewById(rootView, id);
      if (weatherButton == null) {
        break missingId;
      }

      id = R.id.wind;
      TextView wind = ViewBindings.findChildViewById(rootView, id);
      if (wind == null) {
        break missingId;
      }

      return new WeatherBinding((RelativeLayout) rootView, address, addressContainer, closeWeather,
          descrTxt, detailsContainer, errorText, feelLike, humidity, loader, mainContainer,
          overviewContainer, pressure, sunrise, sunset, temp, tempMax, tempMin, updatedAt,
          weatherButton, wind);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}