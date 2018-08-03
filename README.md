# aircraftcontroller

Booting starts at AirCraftManagementAppApplication and written 3 controllers in AirCraftController
1.Enqueue(/createaircraft)
2.Dequeue(/deleteaircraft)
3.GetAllremaining(/allaircrafts)


When an aircraft is created ,it will save in h2 db and will be inserted into the Queue(Enqueue).

Deleting an aircraft means landing a aircraft based on priority,if P1 > P2 ,it will be moved to deque.

Need RabbitMQ software.

