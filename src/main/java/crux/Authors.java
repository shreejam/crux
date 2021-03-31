package crux;

final class Authors {
  // TODO: Add author information.
  static final Author[] all = {new Author("Dustin Fong", "51676161", "dustinnf"), new Author("Shreejam Mistry", "17757927", "shreejam")};
}


final class Author {
  final String name;
  final String studentId;
  final String uciNetId;

  Author(String name, String studentId, String uciNetId) {
    this.name = name;
    this.studentId = studentId;
    this.uciNetId = uciNetId;
  }
}
