String name = "John";
Optional<String> optionalName = Optional.of(name);

String defaultName = "Unknown";
String result = optionalName.orElse(defaultName);
