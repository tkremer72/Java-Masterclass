# Java Map Interface
A map contains values on the basis of key, i.e. key and value pair. Each key and value 
pair is known as an entry. A Map contains unique keys.

A Map is useful if you have to search, update or delete elements on the basis of a key.

# Java Map Hierarchy
There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: 
HashMap, LinkedHashMap, and TreeMap.

There can only be one value per key, if you try to add more than one value per key, the 
original value will be overwritten by the new value.

Great care must be exercised if immutable objects are used as map keys.  Map objects behave
unpredictably if they key objects change in such a way that equals comparisons are affected.

One thing that is not permitted is for a map to contain itself as a key.

