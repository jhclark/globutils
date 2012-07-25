package globutils

object Globs {
  // note: we don't handle curly braces
  // note: we don't handle the "strict wildcard" where * can't match directory slashes
  def globToRegex(glob: String): String = {
    glob.map { 
      _ match {
        case '*' => ".*"
        case '?' => "."
        case esc @ ('.' | '\\' | '+' | '(' | ')' | '|' | '^' | '$' | '@' | '%') => "\\" + esc
        case char @ _ => char
      }
    }.mkString("")
  }
}

