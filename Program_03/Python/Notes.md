## Program 3 Notes:

<!-- Displays Options -->
[optparse]()

[ArgParser](https://www.youtube.com/watch?v=XYUXFR5FSxI))

[Python ArgParser](https://docs.python.org/3/howto/argparse.html#id1)

Checking is Std.In has an item in it

```python
# On Unix systems you can do the following:

import sys
import select

if select.select([sys.stdin,],[],[],0.0)[0]:
    print "Have data!"
else:
    print "No data"
    
# On Windows the select module may only be used with sockets though so you'd need to use an alternative mechanism.
# shareeditfollow
```