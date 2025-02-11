Securibench Micro (Upgrade)
=================

This is a fork of Securibench Micro repository https://github.com/too4words/securibench-micro and its main goals is to upgrade the way "servlets" are handle.

We haved moved from **javax servlet api** to **Jakarta servlet** and in order not to lost the old code we have versioned it in two folders.

This test suite contents 122 tests allocate in 12 categories.

***src/securibench/v1***: contents the test suite using **javax servlet api**

***src/securibench/v2***: contents the test suite using **Jakarta servlet** (upgraded)

Structure
=================

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
