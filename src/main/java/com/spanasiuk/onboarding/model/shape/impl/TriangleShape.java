package com.spanasiuk.onboarding.model.shape.impl;

import com.spanasiuk.onboarding.model.color.Color;
import com.spanasiuk.onboarding.model.color.impl.RedColor;
import com.spanasiuk.onboarding.model.color.impl.YellowColor;
import com.spanasiuk.onboarding.model.shape.AbstractShape;
import com.spanasiuk.onboarding.model.shape.Shape;

public class TriangleShape extends AbstractShape {

  public TriangleShape(Color color) {
    super(color);
  }

  public String getName() {
    return "Triangle";
  }

  @Override
  public Shape applyColor(YellowColor color) {
    return new LineShape(new YellowColor());
  }

  @Override
  public Shape applyColor(RedColor color) {
    return new RectangleShape(new YellowColor());
  }
}
