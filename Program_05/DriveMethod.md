## Drive Implementation Notes:

1. This is a flat file system, single directory, 32 lines of 32 bytes (64 nibbles).
2. Root is always at Cluster 0
3. For next pointers, 0 is null, nothing points to root.
4. "XX:" lines (two of them) are just for your interpreations, not on the disk.
5. 01: first three characters of all data lines are for you interpretation, also.

### Implementation**


**Clusters**

Byte Zero of every cluster:
    0 folder
    1 empty
    2 damaged
    3 file header
    4 file data

**Root Cluster**

Root Cluster (Root dir always starts at cluster 0, LL)
Start LenNibbles  Contents
01    cluster type
02    pointer to linked list of available 
03       02    pointer to linked list of bad clusters
05       02    pointer to linked list of file headers
07       XX    volume name (end with null character)

--------------------------------------------------------------

**File Headers**

File Header Cluster (self contained, no extension)
Start LenNibbles  Contents
00       01       cluster type
01       02       next pointer to next file
03       02       next pointer to file data cluster (if necessary)
02       XX       file name (end with null character)
                  Remainder is file data 

--------------------------------------------------------------

**File Data Cluster**

Start LenNibbles  Contents
00       01       cluster type
01       02       Next pointer to file data cluster extension
03       XX       remainder is file data (except last nibble) 
