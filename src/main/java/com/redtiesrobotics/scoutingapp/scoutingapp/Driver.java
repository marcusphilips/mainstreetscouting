package com.redtiesrobotics.scoutingapp.scoutingapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Driver {
    private  int numTeams;
    private  List<List<String>> data;
    private  List<UnitOfData> unitsOfData;

    public void run(String[] srayancanusesomesoapforhislanguage) throws IOException {
        String inFile = "./data/crapData";
        BufferedReader br = new BufferedReader(new FileReader(inFile));

        numTeams = Integer.parseInt(br.readLine());
        data = new ArrayList<List<String>>(numTeams);
        unitsOfData = new ArrayList<>(numTeams);

        for (int i = 0; i < numTeams; i++) {
            br.readLine();
            List<String> lst = new ArrayList<>();
            for (int j = 0; j < 24; j++) {
                lst.add(br.readLine());
            }
            data.add(lst);
        }

        //Collections.sort(list, compare(Object s1, Object s2) => s1 - s2);


        for (int i = 0; i < numTeams; i++) {
            unitsOfData.add(new UnitOfData(data.get(i)));
        }

        for (int i = 0; i < unitsOfData.size(); i++) {
            System.out.println(unitsOfData.get(i));
        }

        System.out.println(average(21, 1337));
        System.out.println(median(21, 1337));
        System.out.println(standardDeviation(21, 1337));
        System.out.println(mode(21, 1337));
    }

    private  int numbTeams(int team) {
        int num = 0;
        for (int i = 0; i < numTeams; i++) {
            if (Integer.parseInt(unitsOfData.get(i).Datas.get(0)) == team) {
                num++;
            }
        }
        return num;
    }

    private  double average(int index) {

        double sum = 0;
        for (int i = 0; i < numTeams; i++) {
            try {
                sum += Double.parseDouble(unitsOfData.get(i).Datas.get(index));
            } catch (Exception ex) {
                throw new NullPointerException("NORTH != UP!!!");
            }
        }
        return sum / numTeams;
    }

    private  double average(int index, int team) {
        int num = numbTeams(team);
        double sum = 0;
        for (int i = 0; i < numTeams; i++) {
            try {
                if (Integer.parseInt(unitsOfData.get(i).Datas.get(0)) == team) {
                    sum += Double.parseDouble(unitsOfData.get(i).Datas.get(index));
                }
            } catch (Exception ex) {
                throw new NullPointerException("NORTH != UP!!!");
            }
        }
        return sum / num;
    }

    private  double median(int index) {
        double[] dataPieces = new double[numTeams];
        for (int i = 0; i < dataPieces.length; i++) {
            try {
                dataPieces[i] = Double.parseDouble(unitsOfData.get(i).Datas.get(index));
            } catch (Exception ex) {
                throw new NullPointerException("WE ARE THE EXCEPTION!!! *Mongol Montage*");
            }
        }
        Arrays.sort(dataPieces);
        if (dataPieces.length % 2 != 0)
            return dataPieces[dataPieces.length / 2];

        else

            return (dataPieces[dataPieces.length / 2] + dataPieces[dataPieces.length / 2 + 1]) / 2;

        //
    }

    private  double median(int index, int team) {
        int num = numbTeams(team);
        double[] dataPieces = new double[num];
        for (int i = 0; i < dataPieces.length; i++) {
            try {
                if (Integer.parseInt(unitsOfData.get(i).Datas.get(0)) == team) {
                    dataPieces[i] = Double.parseDouble(unitsOfData.get(i).Datas.get(index));
                }
            } catch (Exception ex) {
                throw new NullPointerException("WE ARE THE EXCEPTION!!! *Mongol Montage*");
            }
        }
        Arrays.sort(dataPieces);
        if (dataPieces.length % 2 != 0)
            return dataPieces[dataPieces.length / 2];

        else

            return (dataPieces[dataPieces.length / 2] + dataPieces[dataPieces.length / 2 + 1]) / 2;

        //
    }

    private  double standardDeviation(int index) {
        double average = average(index);
        double acc = 0;
        for (int i = 0; i < numTeams; i++) {
            try {

                acc += Math.pow(Double.parseDouble(unitsOfData.get(i).Datas.get(index)) - average, 2);
            } catch (Exception ex) {
                System.out.println(ex);
                throw new NullPointerException("We are exceptional");
            }

        }
        acc /= numTeams - 1;
        return Math.sqrt(acc);
    }

    private  double standardDeviation(int index, int team) {
        int num = numbTeams(team);
        double average = average(index, team);
        double acc = 0; //accumulate
        for (int i = 0; i < numTeams; i++) {
            try {
                if (Integer.parseInt(unitsOfData.get(i).Datas.get(0)) == team) {
                    acc += Math.pow(Double.parseDouble(unitsOfData.get(i).Datas.get(index)) - average, 2);
                }
            } catch (Exception ex) {
                System.out.println(ex);
                throw new NullPointerException("We are exceptional");
            }

        }
        acc /= num - 1;
        return Math.sqrt(acc);
    }

    private  double mode(int index) {
        double maxValue = 0.0, maxCount = 0.0;
        for (int i = 0; i < numTeams; ++i) {
            int count = 0;
            for (int j = 0; j < numTeams; ++j) {
                if (Double.parseDouble(unitsOfData.get(i).Datas.get(index)) == Double.parseDouble(unitsOfData.get(i).Datas.get(index)))
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = Double.parseDouble(unitsOfData.get(i).Datas.get(index));
            }
        }

        return maxValue;
    }

    private  double mode(int index, int team) {
        int num = numbTeams(team);
        double maxValue = 0.0, maxCount = 0.0;
        for (int i = 0; i < numTeams; ++i) {
            int count = 0;
            if (Integer.parseInt(unitsOfData.get(i).Datas.get(0)) == team) {
                for (int j = 0; j < numTeams; ++j) {
                    if (Integer.parseInt(unitsOfData.get(i).Datas.get(0)) == team) {
                        if (Double.parseDouble(unitsOfData.get(i).Datas.get(index)) == Double.parseDouble(unitsOfData.get(i).Datas.get(index)))
                            ++count;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = Double.parseDouble(unitsOfData.get(i).Datas.get(index));
                }
            }
        }

        return maxValue;
    }
}


