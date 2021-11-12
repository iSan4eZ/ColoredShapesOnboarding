package com.spanasiuk.onboarding.model.shape.impl;

import com.spanasiuk.onboarding.model.color.Color;
import com.spanasiuk.onboarding.model.color.impl.RedColor;
import com.spanasiuk.onboarding.model.color.impl.YellowColor;
import com.spanasiuk.onboarding.model.shape.AbstractShape;
import com.spanasiuk.onboarding.model.shape.Shape;

public class LineShape extends AbstractShape {

  public LineShape(Color color) {
    super(color);
  }

  public String getName() {
    return "Line";
  }

  @Override
  public Shape applyColor(YellowColor color) {
    return new CircleShape(new YellowColor());
  }

  @Override
  public Shape applyColor(RedColor color) {
    return new SquareShape(new YellowColor());
  }
}
