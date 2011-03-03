/**
 * 
 */
package com.fullwish.bean.base;

/**
 * @author fullwish
 * 
 */
public enum Profession {
    MOGUL {
        public String getName() {
            return "´óºà";
        }
    },
    BRAWLER {
        public String getName() {
            return "½Ö°Ô";
        }
    },
    CRIMINAL {
        public String getName() {
            return "ÏÀµÁ";
        }
    };
    public abstract String getName();
}
// public enum Gender {
// MAN{
// public String getName(){return "ÄÐ";}
// },WOMEN{
// public String getName(){return "Å®";}
// };
// public abstract String getName();
// }