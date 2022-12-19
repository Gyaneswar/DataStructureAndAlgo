#include <iostream>
namespace VisionEngineHardware{    
    typedef struct device_t{
        int a;
        int b;
    }device_payload_t;

    class snsimu;
    class device{
        public:
        void invoke(int a,int b){
            printf("invoked inside device %d %d \n",a,b);
        }        
    };

    class imusensor : public device{

    };

    void whatever(int time,snsimu* obj,void(snsimu::*fp)(int,int)){
        printf("invoked outside class \n");
        (obj->*fp)(time,117);
    }

    class imu{
        public:
        void receive(int time , snsimu* obj,void(snsimu::*fp)(int,int)){
            printf("invoked inside imu %d \n",time);            
            whatever(time,obj,fp);
        }
    };

    class snsimu : imusensor{
        public:
        void docallback()
        {
            imu* reader = new imu();
            reader->receive(115,this,&snsimu::read);
        }
        void read(int a, int b){
            printf("invoked inside snsimu %d %d \n",a,b);
            invoke(a,b);
        }
    };
}

int main(){
    printf("Start \n");
    VisionEngineHardware::snsimu* s = new VisionEngineHardware::snsimu();
    s->docallback();
    printf("End \n");
}


