// Generated by view binder compiler. Do not edit!
package com.coding.meet.todo_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.coding.meet.todo_app.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewTaskGridLayoutBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView dateTxt;

  @NonNull
  public final ImageView deleteImg;

  @NonNull
  public final TextView descrTxt;

  @NonNull
  public final LinearLayout editDeleteL;

  @NonNull
  public final ImageView editImg;

  @NonNull
  public final TextView titleTxt;

  private ViewTaskGridLayoutBinding(@NonNull MaterialCardView rootView, @NonNull TextView dateTxt,
      @NonNull ImageView deleteImg, @NonNull TextView descrTxt, @NonNull LinearLayout editDeleteL,
      @NonNull ImageView editImg, @NonNull TextView titleTxt) {
    this.rootView = rootView;
    this.dateTxt = dateTxt;
    this.deleteImg = deleteImg;
    this.descrTxt = descrTxt;
    this.editDeleteL = editDeleteL;
    this.editImg = editImg;
    this.titleTxt = titleTxt;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewTaskGridLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewTaskGridLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_task_grid_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewTaskGridLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dateTxt;
      TextView dateTxt = ViewBindings.findChildViewById(rootView, id);
      if (dateTxt == null) {
        break missingId;
      }

      id = R.id.deleteImg;
      ImageView deleteImg = ViewBindings.findChildViewById(rootView, id);
      if (deleteImg == null) {
        break missingId;
      }

      id = R.id.descrTxt;
      TextView descrTxt = ViewBindings.findChildViewById(rootView, id);
      if (descrTxt == null) {
        break missingId;
      }

      id = R.id.editDeleteL;
      LinearLayout editDeleteL = ViewBindings.findChildViewById(rootView, id);
      if (editDeleteL == null) {
        break missingId;
      }

      id = R.id.editImg;
      ImageView editImg = ViewBindings.findChildViewById(rootView, id);
      if (editImg == null) {
        break missingId;
      }

      id = R.id.titleTxt;
      TextView titleTxt = ViewBindings.findChildViewById(rootView, id);
      if (titleTxt == null) {
        break missingId;
      }

      return new ViewTaskGridLayoutBinding((MaterialCardView) rootView, dateTxt, deleteImg,
          descrTxt, editDeleteL, editImg, titleTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
