package com.spanasiuk.onboarding.model;

import com.spanasiuk.onboarding.model.color.Color;
import com.spanasiuk.onboarding.model.color.impl.EmptyColor;
import com.spanasiuk.onboarding.model.color.impl.RedColor;
import com.spanasiuk.onboarding.model.color.impl.YellowColor;
import com.spanasiuk.onboarding.model.shape.Shape;
import com.spanasiuk.onboarding.model.shape.impl.CircleShape;
import com.spanasiuk.onboarding.model.shape.impl.LineShape;
import com.spanasiuk.onboarding.model.shape.impl.RectangleShape;
import com.spanasiuk.onboarding.model.shape.impl.SquareShape;
import com.spanasiuk.onboarding.model.shape.impl.TriangleShape;
import java.util.Map;
import java.util.stream.Stream;
import javax.script.ScriptException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ShapeColoringParameterizedTest {

  private static Stream<Arguments> data() {
    return Stream.of(
        //Yellow
        Arguments.of(new SquareShape(new EmptyColor()), new YellowColor(), new RectangleShape(new YellowColor())),
        Arguments.of(new CircleShape(new EmptyColor()), new YellowColor(), new TriangleShape(new YellowColor())),
        Arguments.of(new TriangleShape(new EmptyColor()), new YellowColor(), new LineShape(new YellowColor())),
        Arguments.of(new LineShape(new EmptyColor()), new YellowColor(), new CircleShape(new YellowColor())),
        Arguments.of(new RectangleShape(new EmptyColor()), new YellowColor(), new RectangleShape(new EmptyColor())),
        //Red
        Arguments.of(new SquareShape(new EmptyColor()), new RedColor(), new CircleShape(new EmptyColor())),
        Arguments.of(new CircleShape(new EmptyColor()), new RedColor(), new SquareShape(new YellowColor())),
        Arguments.of(new TriangleShape(new EmptyColor()), new RedColor(), new RectangleShape(new YellowColor())),
        Arguments.of(new LineShape(new EmptyColor()), new RedColor(), new SquareShape(new YellowColor())),
        Arguments.of(new RectangleShape(new EmptyColor()), new RedColor(), new RectangleShape(new EmptyColor()))
        );
  }

  @ParameterizedTest
  @MethodSource("data")
  void testFormula(Shape shape, Color colorToApply, Shape expectedShape){
    final Shape result = switch (colorToApply){
      case YellowColor c -> shape.applyColor(c);
      case RedColor c -> shape.applyColor(c);
      default -> shape;
    };

    Assertions.assertThat(result.getName()).isEqualTo(expectedShape.getName());
    Assertions.assertThat(result.getColor().getName()).isEqualTo(expectedShape.getColor().getName());
  }

}