/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2SEModule/module-info.java to edit this template
 */

module people {
    exports com.name;
    requires transitive conversation; // people is dependent on conversation. If any module dependent on pople, the can access conversation.
    
}
