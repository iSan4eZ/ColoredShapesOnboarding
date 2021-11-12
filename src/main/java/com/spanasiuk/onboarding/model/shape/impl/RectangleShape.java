package com.spanasiuk.onboarding.model.shape.impl;

import com.spanasiuk.onboarding.model.color.Color;
import com.spanasiuk.onboarding.model.color.impl.RedColor;
import com.spanasiuk.onboarding.model.color.impl.YellowColor;
import com.spanasiuk.onboarding.model.shape.AbstractShape;
import com.spanasiuk.onboarding.model.shape.Shape;

public class RectangleShape extends AbstractShape {

  public RectangleShape(Color color) {
    super(color);
  }

  public String getName() {
    return "Rectangle";
  }

  @Override
  public Shape applyColor(YellowColor color) {
    return this;
  }

  @Override
  public Shape applyColor(RedColor color) {
    return this;
  }
}
