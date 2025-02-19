Securibench Micro (Upgrade)
=================

This is a fork of Securibench Micro repository https://github.com/too4words/securibench-micro and its main goals is to upgrade the way "servlets" are handle.

We haved moved from **javax servlet api** to **Jakarta servlet** and in order not to lost the old code we have versioned it in two folders.

This test suite contents 122 tests allocate in 12 categories.

***src/securibench/v1***: contents the test suite using **javax servlet api**

***src/securibench/v2***: contents the test suite using **Jakarta servlet** (upgraded)

Structure
=================

|     Test      |  Σ  | TP  |
|:-------------:|:---:|:---:|
|   Aliasing    |  6  | 12  |   
|     Array     | 10  |  9  |  
|     Basic     | 42  | 61  | 
|  Collection   | 14  | 15  | 
| DataStructure |  6  |  6  | 
|    Factory    |  3  |  3  |  
|     Inter     | 14  | 17  | 
|    Session    |  3  |  3  |  
| StrongUpdate  |  5  |  1  | 
|   **TOTAL**   | 103 | 127 | 

- **AliasingTest** - 6 tests that holds 12 TP.

|      Test      | Expected |                     Comment                     |
|:--------------:|:--------:|:-----------------------------------------------:|
|   Aliasing1    |    1     |                                                 | 
|   Aliasing2    |    1     |  It looks that there is no leak in this test.   | 
|   Aliasing3    |    1     |                                                 | 
|   Aliasing4    |    1     | It looks that there are two leaks in this test. | 
|   Aliasing5    |    1     |                                                 | 
|   Aliasing6    |    7     |                                                 | 
|     TOTAL      |    12    |                                                 |

- **ArraysTest** - 10 tests that holds 9 TP.

|      Test      | Expected |                     Comment                     |
|:--------------:|:--------:|:-----------------------------------------------:|
|     Array1     |    1     |                                                 | 
|     Array2     |    1     |                                                 | 
|     Array3     |    1     |                                                 | 
|     Array4     |    1     |                                                 | 
|     Array5     |    0     |                                                 | 
|     Array6     |    1     |                                                 | 
|     Array7     |    1     |                                                 | 
|     Array8     |    1     |                                                 | 
|     Array9     |    1     |                                                 | 
|    Array10     |    1     |                                                 | 
|     TOTAL      |    9     |                                                 | 

- **BasicTest** - 42 tests that holds 61 TP.

|      Test      | Expected |                            Comment                             |
|:--------------:|:--------:|:--------------------------------------------------------------:|
|     Basic1     |    1     |                                                                | 
|     Basic2     |    1     |                                                                | 
|     Basic3     |    1     |                                                                | 
|     Basic4     |    1     |                                                                | 
|     Basic5     |    3     |                                                                | 
|     Basic6     |    1     |                                                                | 
|     Basic7     |    1     |                                                                | 
|     Basic8     |    1     |                                                                | 
|     Basic9     |    1     |                                                                | 
|    Basic10     |    1     |                                                                | 
|    Basic11     |    2     |                                                                | 
|    Basic12     |    2     |                                                                | 
|    Basic13     |    1     |                                                                | 
|    Basic14     |    1     |                                                                | 
|    Basic15     |    1     |                                                                | 
|    Basic16     |    1     |                                                                | 
|    Basic17     |    1     |                                                                | 
|    Basic18     |    1     |                                                                | 
|    Basic19     |    1     |                                                                | 
|    Basic20     |    1     |                                                                | 
|    Basic21     |    4     |                                                                | 
|    Basic22     |    1     |                                                                | 
|    Basic23     |    3     |                                                                | 
|    Basic24     |    1     |                                                                | 
|    Basic25     |    1     |                                                                | 
|    Basic26     |    1     | It does have any comment; however, it counts 1 vulnerability.  | 
|    Basic27     |    1     |                                                                | 
|    Basic28     |    2     |                                                                | 
|    Basic29     |    2     |                                                                | 
|    Basic30     |    1     |                                                                | 
|    Basic31     |    3     | The comments says 3 OKs; however, it counts 2 vulnerabilities. | 
|    Basic32     |    1     |                                                                | 
|    Basic33     |    1     |                                                                | 
|    Basic34     |    2     |                                                                | 
|    Basic35     |    6     |                                                                | 
|    Basic36     |    1     |                                                                | 
|    Basic37     |    1     |                                                                | 
|    Basic38     |    1     |                                                                | 
|    Basic39     |    1     |                                                                | 
|    Basic40     |    1     | It does have any comment; however, it counts 1 vulnerability.  | 
|    Basic41     |    1     |                                                                | 
|    Basic42     |    1     |                                                                | 
|     TOTAL      |    61    |                                                                | 

- **CollectionTest** - 14 tests that holds 15 TP.

|      Test      | Expected |                   Comment                    |
|:--------------:|:--------:|:--------------------------------------------:|
|  Collection1   |    1     |                                              | 
|  Collection2   |    1     |                                              | 
|  Collection3   |    2     |                                              | 
|  Collection4   |    1     |                                              | 
|  Collection5   |    1     |                                              | 
|  Collection6   |    1     |                                              | 
|  Collection7   |    1     |                                              | 
|  Collection8   |    1     |                                              | 
|  Collection9   |    1     | It looks that there is no leak in this test. | 
|  Collection10  |    1     |    The value of var vuln_count is wrong.     | 
|  Collection11  |    1     |                                              | 
|  Collection12  |    1     |                                              | 
|  Collection13  |    1     |                                              | 
|  Collection14  |    1     |                                              | 
|     TOTAL      |    15    |                                              |


- **DataStructureTest** - 6 tests that holds 6 TP.

|      Test      | Expected |                        Comment                         |
|:--------------:|:--------:|:------------------------------------------------------:|
| DataStructure1 |    1     |                                                        |
| DataStructure2 |    1     |                                                        |
| DataStructure3 |    1     |                                                        |
| DataStructure4 |    1     | The comment says OK; however it counts 1 vulnerability |
| DataStructure5 |    1     |                                                        |
| DataStructure6 |    1     |                                                        |
|     TOTAL      |    6     |                                                        |

- **FactoryTest** - 3 tests that holds 3 TP.

|      Test      | Expected |                        Comment                         |
|:--------------:|:--------:|:------------------------------------------------------:|
|    Factory1    |    1     |                                                        |
|    Factory2    |    1     |                                                        |
|    Factory3    |    1     |                                                        |
|     TOTAL      |    3     |                                                        |


- **InterTest** - 14 tests that holds 17 TP.

|      Test      | Expected |                          Comment                           |
|:--------------:|:--------:|:----------------------------------------------------------:|
|     Inter1     |    1     |                                                            |
|     Inter2     |    2     | The comments say 1 BAD; however it counts 2 vulnerability. |
|     Inter3     |    1     |                                                            |
|     Inter4     |    2     | The comments say 1 BAD; however it counts 2 vulnerability  |
|     Inter5     |    2     | The comments say 1 BAD; however it counts 2 vulnerability  |
|     Inter6     |    1     |                                                            |
|     Inter7     |    1     |                                                            |
|     Inter8     |    1     |                                                            |
|     Inter9     |    1     | The comments say 2 BADs; however it counts 1 vulnerability |
|    Inter10     |    1     |           The value of var vuln_count is wrong.            |
|    Inter11     |    1     |                                                            |
|    Inter12     |    1     |                                                            |
|    Inter13     |    1     |                                                            |
|    Inter14     |    1     |                                                            |
|     TOTAL      |    17    |                                                            |


- **SessionTest** - 3 tests that holds 3 TP.

|      Test      | Expected |                          Comment                           |
|:--------------:|:--------:|:----------------------------------------------------------:|
|    Session1    |    1     |                                                            |
|    Session2    |    1     |                                                            |
|    Session3    |    1     |                                                            |
|     TOTAL      |    3     |                                                            |


- **StrongUpdateTest** - 5 tests that holds 1 TP.

|      Test      | Expected |                          Comment                           |
|:--------------:|:--------:|:----------------------------------------------------------:|
| StrongUpdate1  |    0     |                                                            |
| StrongUpdate2  |    0     |                                                            |
| StrongUpdate3  |    0     |                                                            |
| StrongUpdate4  |    1     |                                                            |
| StrongUpdate5  |    0     |                                                            |
|     TOTAL      |    1     |                                                            |

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
