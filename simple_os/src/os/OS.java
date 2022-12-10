package os;

import application.Application;
import java.util.Arrays;

public class OS {

  private int id = 0;
  private static int latestId = 0;

  private String name;

  private Application[] apps;

  private int storageSize = 0;
  private int usedStorage = 0;

  private int count;

  public OS(String name, int storageSize) {
    this.id = latestId++;
    this.name = name;
    this.storageSize = storageSize;

    //Init
    this.apps = new Application[1];
    this.count = 0;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Application[] getApps() {
    return apps;
  }

  public int getStorageSize() {
    return storageSize;
  }

  public int getUsedStorage() {
    return usedStorage;
  }

  public boolean addApplication(Application newApplication) {
    if (usedStorage + newApplication.getSize() > storageSize) return false;

    if (apps.length == count) {
      Application[] temp = new Application[apps.length * 2];

      for (int i = 0; i < count; i++) {
        temp[i] = apps[i];
      }
      apps = temp;
    }
    apps[count++] = newApplication;
    usedStorage += newApplication.getSize();
    return true;
  }

  public void removeApplication(int id) {
    if (count <= 0) return;

    int tempCount = 0;
    Application[] temp = new Application[--count];
    for (int i = 0; i <= count; i++) {
      if (apps[i].getId() == id) {
        usedStorage -= apps[i].getSize();
        continue;
      }
      temp[tempCount++] = apps[i];
    }
    apps = temp;
  }

  public Application getApplicationIdByName(String name) {
    for (int i = 0; i < count; i++) {
      if (name.equals(apps[i].getName())) return apps[i];
    }
    return null;
  }

  @Override
  public String toString() {
    return (
      "OS [id=" +
      id +
      ", name=" +
      name +
      ", apps=" +
      Arrays.toString(apps) +
      ", storageSize=" +
      storageSize +
      ", usedStorage=" +
      usedStorage +
      ", count=" +
      count +
      "]"
    );
  }
}
