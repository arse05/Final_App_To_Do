// Generated by view binder compiler. Do not edit!
package com.coding.meet.todo_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.coding.meet.todo_app.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ExtendedFloatingActionButton addTaskFABtn;

  @NonNull
  public final TextInputEditText edSearch;

  @NonNull
  public final TextInputLayout edSearchL;

  @NonNull
  public final ImageView icWeather;

  @NonNull
  public final ImageView listOrGridImg;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final ImageView sortImg;

  @NonNull
  public final RecyclerView taskRV;

  @NonNull
  public final TextView todayTxt;

  @NonNull
  public final TextView welcomeTxt;

  private ActivityMainBinding(@NonNull CoordinatorLayout rootView,
      @NonNull ExtendedFloatingActionButton addTaskFABtn, @NonNull TextInputEditText edSearch,
      @NonNull TextInputLayout edSearchL, @NonNull ImageView icWeather,
      @NonNull ImageView listOrGridImg, @NonNull NestedScrollView nestedScrollView,
      @NonNull ImageView sortImg, @NonNull RecyclerView taskRV, @NonNull TextView todayTxt,
      @NonNull TextView welcomeTxt) {
    this.rootView = rootView;
    this.addTaskFABtn = addTaskFABtn;
    this.edSearch = edSearch;
    this.edSearchL = edSearchL;
    this.icWeather = icWeather;
    this.listOrGridImg = listOrGridImg;
    this.nestedScrollView = nestedScrollView;
    this.sortImg = sortImg;
    this.taskRV = taskRV;
    this.todayTxt = todayTxt;
    this.welcomeTxt = welcomeTxt;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addTaskFABtn;
      ExtendedFloatingActionButton addTaskFABtn = ViewBindings.findChildViewById(rootView, id);
      if (addTaskFABtn == null) {
        break missingId;
      }

      id = R.id.edSearch;
      TextInputEditText edSearch = ViewBindings.findChildViewById(rootView, id);
      if (edSearch == null) {
        break missingId;
      }

      id = R.id.edSearchL;
      TextInputLayout edSearchL = ViewBindings.findChildViewById(rootView, id);
      if (edSearchL == null) {
        break missingId;
      }

      id = R.id.ic_weather;
      ImageView icWeather = ViewBindings.findChildViewById(rootView, id);
      if (icWeather == null) {
        break missingId;
      }

      id = R.id.listOrGridImg;
      ImageView listOrGridImg = ViewBindings.findChildViewById(rootView, id);
      if (listOrGridImg == null) {
        break missingId;
      }

      id = R.id.nestedScrollView;
      NestedScrollView nestedScrollView = ViewBindings.findChildViewById(rootView, id);
      if (nestedScrollView == null) {
        break missingId;
      }

      id = R.id.sortImg;
      ImageView sortImg = ViewBindings.findChildViewById(rootView, id);
      if (sortImg == null) {
        break missingId;
      }

      id = R.id.taskRV;
      RecyclerView taskRV = ViewBindings.findChildViewById(rootView, id);
      if (taskRV == null) {
        break missingId;
      }

      id = R.id.todayTxt;
      TextView todayTxt = ViewBindings.findChildViewById(rootView, id);
      if (todayTxt == null) {
        break missingId;
      }

      id = R.id.welcomeTxt;
      TextView welcomeTxt = ViewBindings.findChildViewById(rootView, id);
      if (welcomeTxt == null) {
        break missingId;
      }

      return new ActivityMainBinding((CoordinatorLayout) rootView, addTaskFABtn, edSearch,
          edSearchL, icWeather, listOrGridImg, nestedScrollView, sortImg, taskRV, todayTxt,
          welcomeTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}