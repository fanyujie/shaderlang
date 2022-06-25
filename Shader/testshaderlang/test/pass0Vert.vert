
#version 450
#extension GL_ARB_separate_shader_objects : enable
    layout(location=0) in vec3  _vertex;
layout(location=1) in vec4  _color;
layout(location=0) out vec4  fragment_color;


                layout(binding=0) uniform blocktype
                {
                    vec4 _Color;
                    float _Time;
                } block ;

                void main()
                {
                    gl_Position=vec4(_vertex,1);
                    fragment_color=_color;
                }
                
