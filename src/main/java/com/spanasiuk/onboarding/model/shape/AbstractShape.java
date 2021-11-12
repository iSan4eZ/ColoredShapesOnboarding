package com.spanasiuk.onboarding.model.shape;

import com.spanasiuk.onboarding.model.color.Color;
import com.spanasiuk.onboarding.model.color.impl.EmptyColor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public abstract class AbstractShape implements Shape {

  protected Color color;

  public AbstractShape(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }
}
