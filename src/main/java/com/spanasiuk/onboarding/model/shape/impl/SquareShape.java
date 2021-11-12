package com.spanasiuk.onboarding.model.shape.impl;

import com.spanasiuk.onboarding.model.color.Color;
import com.spanasiuk.onboarding.model.color.impl.EmptyColor;
import com.spanasiuk.onboarding.model.color.impl.RedColor;
import com.spanasiuk.onboarding.model.color.impl.YellowColor;
import com.spanasiuk.onboarding.model.shape.AbstractShape;
import com.spanasiuk.onboarding.model.shape.Shape;

public class SquareShape extends AbstractShape {

  public SquareShape(Color color) {
    super(color);
  }

  public String getName() {
    return "Square";
  }

  @Override
  public Shape applyColor(YellowColor color) {
    return new RectangleShape(new YellowColor());
  }

  @Override
  public Shape applyColor(RedColor color) {
    return new CircleShape(new EmptyColor());
  }
}
