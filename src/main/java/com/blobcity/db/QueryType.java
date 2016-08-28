/*
 * Copyright 2011 - 2013, BlobCity iSolutions Pvt. Ltd.
 */
package com.blobcity.db;

/**
 *
 * @author Karishma
 * @author Sanket Sarang
 */
enum QueryType {
    
    // data related commands
    LOAD("select"),
    SAVE("save"),
    INSERT("insert"), 
    REMOVE("delete"),
    SELECT_ALL("select-all"),
    SEARCH("search"),
    CONTAINS("contains"),
    INSERT_CUSTOM("insert-custom"),

    // database related commands
    CREATE_DS("create-ds"),
    CREATE_COLLECTION("create-collection"),
    LIST_DS("list-ds"),
    LIST_COLLECTIONS("list-collections"),
    DROP_DATASTORE("drop-ds"),
    DROP_COLLECTION("drop-collection"),
    TRUNCATE_COLLECTION("truncate-collection"),
    ADD_COLUMN("add-column"),
    DROP_COLUMN("drop-column"),
    INDEX("index"),
    DROP_INDEX("drop-index"),

    // user-provided code related commands
    SEARCH_FILTERED("search-filtered"),
    STORED_PROC("sp"),
    REPOP_TABLE("repop"); //possibly depricate this function
    
    private final String queryCode;
    
    QueryType(final String queryCode) {
        this.queryCode = queryCode;
    }

    public String getQueryCode() {
        return queryCode;
    }
}

