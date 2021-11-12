package com.spanasiuk.onboarding.model.shape;

import com.spanasiuk.onboarding.model.color.Color;
import com.spanasiuk.onboarding.model.color.impl.RedColor;
import com.spanasiuk.onboarding.model.color.impl.YellowColor;

public interface Shape {

  String getName();

  Color getColor();

  Shape applyColor(YellowColor color);

  Shape applyColor(RedColor color);

}
