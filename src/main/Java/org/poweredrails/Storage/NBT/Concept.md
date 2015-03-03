# Overall Concept

There will be six locations the plugin can write NBT data:
 - Player
 - World
 - Plugin Save (Size Limit) (Not Recommended)
 - Blocks
 - Items
 - Entities

 To access the content in these locations a plugin must first register itself with the core
 storage service, providing classes that implement the interface for NBT storage. After initial creation,
 the plugin only needs to refer to its class that extends NBT, as it provides an Async solution to saving
 content. To save to a specific region, a class must extend the proper class (I.E. PlayerNBT, WorldNBT).

 TODO: Add more details.