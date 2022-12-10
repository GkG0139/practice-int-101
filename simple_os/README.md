# Simple OS

This task will require you to have some knowledge of OOP and looping to complete.

## The `Application` Class

A class called "Application" should contain:

#### Instance variables
- `id`: private int
- `latestId`: private static int 
- `name`: private String
- `description`: private String
- `size`: private int 

### Constructor
The constructor should do these following task:
- set `id` as `latestId`
- increment `latestId` by 1
- receive the `name`, `description`, and `size`, then assign them to the instance variables

#### Methods
- Getters of variables: `id`, `name`, `description`, and `size`
- `toString():String`

## The `OS` Class

A class called "OS" should contain:

#### Instance variables
- `id`: private int
- `latestId`: private static int 
- `name`: private String
- `apps`: private Application[]
- `storageSize` private int
- `usedStorage` private int
- `count` private int

### Constructor
The constructor should do these following task:
- set `id` as `latestId`
- increment `latestId` by 1
- receive the `name`, and `storageSize`, the assign it to the instance variables

#### Methods
- Getters of variables: `id`, `name`, `apps`, `storageSize`, and `usedStorage`
- `addApplication(newApp:Application):boolean`: 
    - this method should add a new element to the `apps` array and increase the `usedStorage` by the application size
    - return false if the new application size is bigger than the remaining storage, otherwise, return true at the end of the process
- `removeApplication(id:int)`: this method should remove a specific application from the `apps` array and free the storage size used by the application
- `getApplicationIdByName(name:String):Application`: this method should find and return application id
- `toString():String`

## Don't forget to do the test :)
