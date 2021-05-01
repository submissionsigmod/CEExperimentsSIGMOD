package Graphflow;

public class LargeBenchmarkDecompositions {
    public static final int BASE = 200;
    public static Integer[][][] LENGTH2 = new Integer[][][] {
        { // 201
            {0, 1, 0, 2}, {0, 1, 0, 3}, {0, 1, 0, 4}, {0, 1, 0, 5}, {0, 1, 0, 6},
            {0, 2, 0, 3}, {0, 2, 0, 4}, {0, 2, 0, 5}, {0, 2, 0, 6},
            {0, 3, 0, 4}, {0, 3, 0, 5}, {0, 3, 0, 6},
            {0, 4, 0, 5}, {0, 4, 0, 6},
            {0, 5, 0, 6}
        },
        { // 202
            {0, 1, 0, 2}, {0, 1, 0, 3}, {0, 1, 0, 4}, {0, 1, 0, 5},
            {0, 2, 0, 3}, {0, 2, 0, 4}, {0, 2, 0, 5},
            {0, 3, 0, 4}, {0, 3, 0, 5},
            {0, 4, 0, 5},
            {0, 5, 5, 6}
        },
        { // 203
            {0, 1, 0, 2}, {0, 1, 0, 3}, {0, 2, 0, 3},
            {0, 3, 3, 4},
            {3, 4, 4, 5}, {3, 4, 4, 6}, {4, 5, 4, 6}
        },
        { // 204
            {0, 1, 0, 2}, {0, 1, 0, 3}, {0, 2, 0, 3},
            {0, 3, 3, 4}, {3, 4, 4, 5}, {4, 5, 5, 6}
        },
        { // 205
            {0, 1, 0, 3}, {0, 3, 2, 3}, {2, 3, 2, 4}, {2, 4, 4, 5}, {4, 5, 5, 6}
        },
        { // 206
            {0, 1, 0, 2}, {0, 1, 0, 3}, {0, 1, 0, 4}, {0, 1, 0, 5}, {0, 1, 0, 6}, {0, 1, 0, 7},
            {0, 2, 0, 3}, {0, 2, 0, 4}, {0, 2, 0, 5}, {0, 2, 0, 6}, {0, 2, 0, 7},
            {0, 3, 0, 4}, {0, 3, 0, 5}, {0, 3, 0, 6}, {0, 3, 0, 7},
            {0, 4, 0, 5}, {0, 4, 0, 6}, {0, 4, 0, 7},
            {0, 5, 0, 6}, {0, 5, 0, 7},
            {0, 6, 0, 7}
        },
        { // 207
            {0, 1, 0, 2}, {0, 1, 0, 3}, {0, 1, 0, 4}, {0, 1, 0, 5}, {0, 1, 0, 6},
            {0, 2, 0, 3}, {0, 2, 0, 4}, {0, 2, 0, 5}, {0, 2, 0, 6},
            {0, 3, 0, 4}, {0, 3, 0, 5}, {0, 3, 0, 6},
            {0, 4, 0, 5}, {0, 4, 0, 6},
            {0, 5, 0, 6},
            {0, 6, 6, 7}
        },
        { // 208
            {0, 1, 0, 2}, {0, 1, 0, 3}, {0, 1, 0, 4},
            {0, 2, 0, 3}, {0, 2, 0, 4},
            {0, 3, 0, 4},
            {0, 4, 4, 5},
            {4, 5, 5, 6}, {4, 5, 5, 7}, {5, 6, 5, 7}
        },
        { // 209
            {0, 1, 0, 2}, {0, 1, 0, 3}, {0, 1, 0, 4}, {0, 2, 0, 3}, {0, 2, 0, 4}, {0, 3, 0, 4},
            {0, 4, 4, 5}, {4, 5, 5, 6}, {5, 6, 6, 7}
        },
        { // 210
            {0, 1, 1, 3}, {1, 3, 2, 3}, {2, 3, 2, 4}, {2, 4, 4, 6},
            {4, 6, 5, 6}, {4, 6, 6, 7}, {5, 6, 6, 7}
        },
        { // 211
            {0, 1, 0, 3}, {0, 3, 2, 3}, {2, 3, 2, 5}, {2, 5, 4, 5}, {4, 5, 4, 6}, {4, 6, 6, 7}
        },
        { // 212
            {0, 2, 1, 2}, {0, 2, 2, 3}, {0, 2, 2, 4}, {0, 2, 2, 5}, {0, 2, 2, 6}, {0, 2, 2, 7}, {0, 2, 2, 8},
            {1, 2, 2, 3}, {1, 2, 2, 4}, {1, 2, 2, 5}, {1, 2, 2, 6}, {1, 2, 2, 7}, {1, 2, 2, 8},
            {2, 3, 2, 4}, {2, 3, 2, 5}, {2, 3, 2, 6}, {2, 3, 2, 7}, {2, 3, 2, 8},
            {2, 4, 2, 5}, {2, 4, 2, 6}, {2, 4, 2, 7}, {2, 4, 2, 8},
            {2, 5, 2, 6}, {2, 5, 2, 7}, {2, 5, 2, 8},
            {2, 6, 2, 7}, {2, 6, 2, 8},
            {2, 7, 2, 8}
        },
        { // 213
            {0, 1, 0, 2}, {0, 1, 0, 3}, {0, 1, 0, 4}, {0, 1, 0, 5}, {0, 1, 0, 6}, {0, 1, 0, 7},
            {0, 2, 0, 3}, {0, 2, 0, 4}, {0, 2, 0, 5}, {0, 2, 0, 6}, {0, 2, 0, 7},
            {0, 3, 0, 4}, {0, 3, 0, 5}, {0, 3, 0, 6}, {0, 3, 0, 7},
            {0, 4, 0, 5}, {0, 4, 0, 6}, {0, 4, 0, 7},
            {0, 5, 0, 6}, {0, 5, 0, 7},
            {0, 6, 0, 7},
            {0, 7, 7, 8}
        },
        { // 214
            {0, 1, 0, 2}, {0, 1, 0, 3}, {0, 1, 0, 4}, {0, 1, 0, 5}, {0, 1, 0, 6},
            {0, 2, 0, 3}, {0, 2, 0, 4}, {0, 2, 0, 5}, {0, 2, 0, 6},
            {0, 3, 0, 4}, {0, 3, 0, 5}, {0, 3, 0, 6},
            {0, 4, 0, 5}, {0, 4, 0, 6},
            {0, 5, 0, 6},
            {0, 6, 6, 7}, {6, 7, 7, 8}
        },
        { // 215
            {0, 1, 0, 2}, {0, 1, 0, 3}, {0, 1, 0, 4},
            {0, 2, 0, 3}, {0, 2, 0, 4},
            {0, 3, 0, 4},
            {0, 4, 4, 5}, {4, 5, 5, 6}, {5, 6, 6, 7}, {5, 6, 6, 8}, {6, 7, 6, 8}
        },
        { // 216
            {0, 2, 1, 2}, {1, 2, 1, 3}, {1, 3, 3, 5}, {3, 5, 4, 5},
            {4, 5, 4, 6}, {4, 5, 4, 7}, {4, 5, 4, 8},
            {4, 6, 4, 7}, {4, 6, 4, 8},
            {4, 7, 4, 8}
        },
        { // 217
            {0, 1, 1, 2}, {1, 2, 2, 4}, {2, 4, 3, 4}, {3, 4, 3, 6}, {3, 6, 5, 6},
            {5, 6, 5, 7}, {5, 6, 5, 8}, {5, 7, 5, 8}
        },
        { // 218
            {0, 1, 0, 3}, {0, 3, 2, 3}, {2, 3, 2, 5}, {2, 5, 4, 5}, {4, 5, 4, 6}, {4, 6, 6, 7}, {6, 7, 7, 8}
        },
        { // 219
            {0, 3, 1, 3}, {0, 3, 2, 3}, {0, 3, 3, 4}, {0, 3, 3, 5}, {0, 3, 3, 6},
            {1, 3, 2, 3}, {1, 3, 3, 4}, {1, 3, 3, 5}, {1, 3, 3, 6},
            {2, 3, 3, 4}, {2, 3, 3, 5}, {2, 3, 3, 6},
            {3, 4, 3, 5}, {3, 4, 3, 6},
            {3, 5, 3, 6}
        },
        { // 220
            {0, 3, 1, 3}, {0, 3, 2, 3}, {0, 3, 3, 4}, {0, 3, 3, 5}, {0, 3, 3, 6}, {0, 3, 3, 7},
            {1, 3, 2, 3}, {1, 3, 3, 4}, {1, 3, 3, 5}, {1, 3, 3, 6}, {1, 3, 3, 7},
            {2, 3, 3, 4}, {2, 3, 3, 5}, {2, 3, 3, 6}, {2, 3, 3, 7},
            {3, 4, 3, 5}, {3, 4, 3, 6}, {3, 4, 3, 7},
            {3, 5, 3, 6}, {3, 5, 3, 7},
            {3, 6, 3, 7}
        },
        { // 221
            {0, 3, 1, 3}, {0, 3, 2, 3}, {0, 3, 3, 4}, {0, 3, 3, 5}, {0, 3, 3, 6},
            {1, 3, 2, 3}, {1, 3, 3, 4}, {1, 3, 3, 5}, {1, 3, 3, 6},
            {2, 3, 3, 4}, {2, 3, 3, 5}, {2, 3, 3, 6},
            {3, 4, 3, 5}, {3, 4, 3, 6},
            {3, 5, 3, 6},
            {3, 6, 6, 7}
        },
        { // 222
            {0, 2, 1, 2}, {0, 2, 2, 3}, {0, 2, 2, 4},
            {1, 2, 2, 3}, {1, 2, 2, 4},
            {2, 3, 2, 4},
            {2, 4, 4, 6}, {4, 6, 5, 6}, {5, 6, 5, 7}
        },
        { // 223
            {0, 4, 1, 4}, {0, 4, 2, 4}, {0, 4, 3, 4}, {0, 4, 4, 5}, {0, 4, 4, 6}, {0, 4, 4, 7}, {0, 4, 4, 8},
            {1, 4, 2, 4}, {1, 4, 3, 4}, {1, 4, 4, 5}, {1, 4, 4, 6}, {1, 4, 4, 7}, {1, 4, 4, 8},
            {2, 4, 3, 4}, {2, 4, 4, 5}, {2, 4, 4, 6}, {2, 4, 4, 7}, {2, 4, 4, 8},
            {3, 4, 4, 5}, {3, 4, 4, 6}, {3, 4, 4, 7}, {3, 4, 4, 8},
            {4, 5, 4, 6}, {4, 5, 4, 7}, {4, 5, 4, 8},
            {4, 6, 4, 7}, {4, 6, 4, 8},
            {4, 7, 4, 8}
        },
        { // 224
            {0, 4, 1, 4}, {0, 4, 2, 4}, {0, 4, 3, 4}, {0, 4, 4, 5}, {0, 4, 4, 6}, {0, 4, 4, 7},
            {1, 4, 2, 4}, {1, 4, 3, 4}, {1, 4, 4, 5}, {1, 4, 4, 6}, {1, 4, 4, 7},
            {2, 4, 3, 4}, {2, 4, 4, 5}, {2, 4, 4, 6}, {2, 4, 4, 7},
            {3, 4, 4, 5}, {3, 4, 4, 6}, {3, 4, 4, 7},
            {4, 5, 4, 6}, {4, 5, 4, 7},
            {4, 6, 4, 7},
            {4, 7, 7, 8}
        },
        { // 225
            {0, 2, 1, 2}, {1, 2, 1, 6},
            {1, 6, 3, 6}, {1, 6, 4, 6}, {1, 6, 5, 6}, {1, 6, 6, 7}, {1, 6, 6, 8},
            {3, 6, 4, 6}, {3, 6, 5, 6}, {3, 6, 6, 7}, {3, 6, 6, 8},
            {4, 6, 5, 6}, {4, 6, 6, 7}, {4, 6, 6, 8},
            {5, 6, 6, 7}, {5, 6, 6, 8},
            {6, 7, 6, 8}
        },
        { // 226
            {0, 2, 1, 2}, {0, 2, 2, 4}, {1, 2, 2, 4},
            {2, 4, 3, 4}, {3, 4, 3, 7},
            {3, 7, 5, 7}, {3, 7, 6, 7}, {3, 7, 7, 8},
            {5, 7, 6, 7}, {5, 7, 7, 8},
            {6, 7, 7, 8}
        },
        { // 227
            {0, 1, 0, 3}, {0, 3, 2, 3}, {2, 3, 2, 5}, {2, 5, 4, 5}, {4, 5, 4, 7},
            {4, 7, 6, 7}, {4, 7, 7, 8}, {6, 7, 7, 8}
        }
    };

    public static Integer[][][] LENGTH1 = new Integer[][][] {
        { // 201
            {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}
        },
        { // 202
            {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {5, 6}
        },
        { // 203
            {0, 1}, {0, 2}, {0, 3}, {3, 4}, {4, 5}, {4, 6}
        },
        { // 204
            {0, 1}, {0, 2}, {0, 3}, {3, 4}, {4, 5}, {5, 6}
        },
        { // 205
            {0, 1}, {0, 3}, {2, 3}, {2, 4}, {4, 5}, {5, 6}
        },
        { // 206
            {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}
        },
        { // 207
            {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {6, 7}
        },
        { // 208
            {0, 1}, {0, 2}, {0, 3}, {0, 4}, {4, 5}, {5, 6}, {5, 7}
        },
        { // 209
            {0, 1}, {0, 2}, {0, 3}, {0, 4}, {4, 5}, {5, 6}, {6, 7}
        },
        { // 210
            {0, 1}, {1, 3}, {2, 3}, {2, 4}, {4, 6}, {5, 6}, {6, 7}
        },
        { // 211
            {0, 1}, {0, 3}, {2, 3}, {2, 5}, {4, 5}, {4, 6}, {6, 7}
        },
        { // 212
            {0, 2}, {1, 2}, {2, 3}, {2, 4}, {2, 5}, {2, 6}, {2, 7}, {2, 8}
        },
        { // 213
            {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}, {7, 8}
        },
        { // 214
            {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {6, 7}, {7, 8}
        },
        { // 215
            {0, 1}, {0, 2}, {0, 3}, {0, 4}, {4, 5}, {5, 6}, {6, 7}, {6, 8}
        },
        { // 216
            {0, 2}, {1, 2}, {1, 3}, {3, 5}, {4, 5}, {4, 6}, {4, 7}, {4, 8}
        },
        { // 217
            {0, 1}, {1, 2}, {2, 4}, {3, 4}, {3, 6}, {5, 6}, {5, 7}, {5, 8}
        },
        { // 218
            {0, 1}, {0, 3}, {2, 3}, {2, 5}, {4, 5}, {4, 6}, {6, 7}, {7, 8}
        },
        { // 219
            {0, 3}, {1, 3}, {2, 3}, {3, 4}, {3, 5}, {3, 6}
        },
        { // 220
            {0, 3}, {1, 3}, {2, 3}, {3, 4}, {3, 5}, {3, 6}, {3, 7}
        },
        { // 221
            {0, 3}, {1, 3}, {2, 3}, {3, 4}, {3, 5}, {3, 6}, {6, 7}
        },
        { // 222
            {0, 2}, {1, 2}, {2, 3}, {2, 4}, {4, 6}, {5, 6}, {5, 7}
        },
        { // 223
            {0, 4}, {1, 4}, {2, 4}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {4, 8}
        },
        { // 224
            {0, 4}, {1, 4}, {2, 4}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}
        },
        { // 225
            {0, 2}, {1, 2}, {1, 6}, {3, 6}, {4, 6}, {5, 6}, {6, 7}, {6, 8}
        },
        { // 226
            {0, 2}, {1, 2}, {2, 4}, {3, 4}, {3, 7}, {5, 7}, {6, 7}, {7, 8}
        },
        { // 227
            {0, 1}, {0, 3}, {2, 3}, {2, 5}, {4, 5}, {4, 7}, {6, 7}, {7, 8}
        }
    };
}
