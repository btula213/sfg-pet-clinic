##How to load initial data using Bootstrap

1. Create a package called bootstrap
2. Create a class DataLoader that implements CommandLineRunner
3. After the spring initializes, the CLR's Run method is executed to load the data.
   1. Check DataLoader.java

### How to generate id for Map
   To auto-assign ID value, you can do Collections.max()+1;
   Check Dataloader.java getNextId() method.
