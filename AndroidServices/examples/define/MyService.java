public class MyService extends Service {

  @Override
  public int onStartCommand(Intent intent, int flags, int startId) {
	  //TODO do something useful
	  return Service.START_NOT_STICKY;
  }

  @Override
  public IBinder onBind(Intent intent) {
	//TODO for communication return IBinder implementation
    return null;
  }
} 