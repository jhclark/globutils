Ever wanted to convert a glob to a regex in Scala? Have some code.

Build it:

```bash
scalac globutils.scala
```

Test it:

```bash
scala -cp . -e 'println(globutils.Globs.globToRegex("h??i*"))'
```

License: Do whatever you want with this code, but don't blame me for anything.

Enjoy.
