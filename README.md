Securibench Micro (Upgrade)
=================

This is a fork of Securibench Micro repository https://github.com/too4words/securibench-micro and its main goals is to upgrade the way "servlets" are handle.

We haved moved from **javax servlet api** to **Jakarta servlet** and in order not to lost the old code we have versioned it in two folders.

This test suite contents 122 tests allocate in 12 categories.

***src/securibench/v1***: contents the test suite using **javax servlet api**

***src/securibench/v2***: contents the test suite using **Jakarta servlet** (upgraded)

Structure
=================

- **AliasingTest** - 6 test that holds 12 TP.

|      Test      | Expected |                     Comment                     |
|:--------------:|:--------:|:-----------------------------------------------:|
|   Aliasing1    |    1     |                                                 | 
|   Aliasing2    |    1     |  It looks that there is no leak in this test.   | 
|   Aliasing3    |    1     |                                                 | 
|   Aliasing4    |    1     | It looks that there are two leaks in this test. | 
|   Aliasing5    |    1     |                                                 | 
|   Aliasing6    |    7     |                                                 | 
|     TOTAL      |    12    |                                                 | 


- src
    - securibench
        - v1 (122)
            - Aliasing (6)
            - Arrays (10)
            - Basic (42)
            - Collections (14)
            - DataStructures (6)
            - Factories (3)
            - Inter (14)
            - Pred (9)
            - Reflection (4)
            - Sanitizers (6)
            - Session (3)
            - Strong Updates (5)
        - v2 (122)
            - Aliasing (6)
            - Arrays (10)
            - Basic (42)
            - Collections (14)
            - DataStructures (6)
            - Factories (3)
            - Inter (14)
            - Pred (9)
            - Reflection (4)
            - Sanitizers (6)
            - Session (3)
            - Strong Updates (5)
