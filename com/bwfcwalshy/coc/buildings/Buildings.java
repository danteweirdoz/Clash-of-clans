package com.bwfcwalshy.coc;

public enum Buildings {

    TOWNHALL, GOLDCOLLECTOR, ELIXIRCOLLECTOR, WALL, BARRACKS, GOLDSTORAGE, ELIXIRSTORAGE, BUILDERHUT;
    
    int storage;
    int productionRate;
    int hp;
    
    Buildings(int storage, int productionRate, int hp){
        this.storage = storage;
        this.productionRate = productionRate;
        this.hp = hp;
    }
    
}
