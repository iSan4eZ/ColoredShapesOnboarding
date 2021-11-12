package com.spanasiuk.onboarding.model.shape.impl;

import com.spanasiuk.onboarding.model.color.Color;
import com.spanasiuk.onboarding.model.color.impl.RedColor;
import com.spanasiuk.onboarding.model.color.impl.YellowColor;
import com.spanasiuk.onboarding.model.shape.AbstractShape;
import com.spanasiuk.onboarding.model.shape.Shape;

public class CircleShape extends AbstractShape {

  public CircleShape(Color color) {
    super(color);
  }

  public String getName() {
    return "Circle";
  }

  @Override
  public Shape applyColor(YellowColor color) {
    return new TriangleShape(new YellowColor());
  }

  @Override
  public Shape applyColor(RedColor color) {
    return new SquareShape(new YellowColor());
  }

}
