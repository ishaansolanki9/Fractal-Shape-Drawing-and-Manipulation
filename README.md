Name: Fractal Shape Drawing and Manipulation
Description: 
  A Java program for creating, manipulating, and visualizing fractal shapes
  using recursive geometry and object-oriented design. Includes a drawing
  interface and tools for exploring geometric patterns.

Features:
  - Generates and visualizes fractal shapes (e.g., Koch snowflake)
  - Provides shape manipulation and drawing interface
  - Uses recursion, inheritance, and polymorphism
  - Modular class structure for easy extension
  - Includes automated unit tests for validation

Files:
  - Shape.java: Abstract base for all geometric shapes
  - Point.java: Represents 2D coordinates
  - Line.java: Defines line segments between points
  - Polygon.java: Represents multi-point geometric shapes
  - Rectangle.java: Specialized polygon for rectangular shapes
  - FractalShape.java: Abstract class for recursive fractal structures
  - SnowflakeFractal.java: Implements the Koch snowflake
  - FractalDrawer.java: Manages recursive fractal generation and rendering
  - DrawingPad.java: Provides graphical drawing surface
  - Main.java: Entry point for running and visualizing fractals
  - ShapeTests.java: Unit tests for geometric shapes
  - FractalShapeTest.java: Unit tests for fractal recursion logic

Usage:
  Steps:
    - Clone the repository:
      - git clone https://github.com/yourusername/fractal-shape-drawing-and-manipulation.git
      - cd fractal-shape-drawing-and-manipulation
    - Compile all Java files:
      - javac *.java
    - Run the program:
      - java Main
  Example:
    Output:
      - Generates a fractal snowflake and prints geometric data
      - Displays recursive depth and interactive drawing output

Concepts Used:
  - Recursion and fractal geometry
  - Object-oriented programming (inheritance, polymorphism)
  - Java AWT/Swing drawing interface
  - Geometry-based data modeling
  - Software testing and modular architecture

Testing:
  - Run tests using:
    - java ShapeTests
    - java FractalShapeTest
  - Verifies geometry calculations and fractal correctness

License: MIT License © 2025 Ishaan Solanki
