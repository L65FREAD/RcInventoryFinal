package com.devnom.model;

public class Frame extends InventoryItem{ // Maybe make this an interface
    String type;    // Possible types: Street or Offroad
                     // Design decision: Should this be two classes that
                     // inherit frame. Ex: StreetFrame, OffroadFrame
}
